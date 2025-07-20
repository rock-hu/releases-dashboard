# Dagger 2.53

## release on 20241202
## description
## changes
Potentially breaking changes:

<code>@Binds</code> methods now requires explicit nullability

<strong>New:</strong> <code>@Binds</code> methods must explicitly declare nullability (previously we tried to infer it from  

the parameter). This change aligns the nullability behavior of <code>@Binds</code> with how nullability is  

treated elsewhere in Dagger by requiring it to be explict at the request and declaration sites.  

(<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/4941926c57958915b288423f28706a5496fee93c/hovercard" href="https://github.com/google/dagger/commit/4941926c57958915b288423f28706a5496fee93c"><tt>4941926</tt></a>)

<strong>Suggested fix:</strong> If you get a failure due to this change, add the proper nullability to your <code>@Binds</code> method/parameter. For example:

    @Module
    interface MyModule {
    -    @Binds fun bindToNullableImpl(impl: FooImpl): Foo
    +    @Binds fun bindToNullableImpl(impl: FooImpl?): Foo?
    }

Scopes are now banned on <code>@Binds</code> that delegate to production implementations.

<strong>New:</strong> Scoping an <code>@Binds</code> method that delegates to an <code>@Produces</code> implementation is not  

allowed. The scope was ignored anyway because production bindings are implicitly scoped. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/03b237ff2e37272ae65f8c116f9f395f0b44be1b/hovercard" href="https://github.com/google/dagger/commit/03b237ff2e37272ae65f8c116f9f395f0b44be1b"><tt>03b237f</tt></a>)

<strong>Suggested fix:</strong> Remove the scope annotation (since the scope was ignored, this should not be a functional change).

    @Module
    interface MyModule {
    -    @ProductionScoped
         @Binds fun bindToProductionImpl(impl: FooImpl): Foo
    }

<code>@JvmSuppressWildcards</code> now required on multibound map requests in KSP.

<strong>New:</strong> When requesting a multibound map, users must include <code>@JvmSuppressWildcards</code> on the  

map's value, e.g. <code>Map&lt;K, @JvmSuppressWildcards V&gt;</code>. Note that this has always been the behavior  

in KAPT, but due to a bug in the KSP implementation we accidentally matched the request without  

<code>@JvmSuppressWildcards</code>.

<strong>Suggested fix:</strong> Unfortunately, this means users may need to add back <code>@JvmSuppressWildcards</code>  

for multibound map requests. At the moment, KSP doesn't provide a way to determine the Kotlin type  

is actually assignable to <code>Map&lt;K, V&gt;</code> without <code>@JvmSuppressWildcards</code> at compile time, and without  

this check users could hit runtime failures when Dagger tries to cast the type to the users type.

    class MyClass
    @Inject constructor(
    -    multiboundMap: Map<K, V>
    +    multiboundMap: Map<K, @JvmSuppressWildcards V>
    )

In the future, we may consider simple cases where we can guarantee that <code>@JvmSuppressWildcards</code> can  

be elided, but that is out of scope for this release.

Remove support for Java 7

<strong>New:</strong> Dagger has officially removed support for Java 7. Oracle ended support for Java 7 in  

July 2022, and since Dagger has upgraded to JDK 18, compiling with language level 7 is no longer  

supported. Note that this may not break users immediately since Dagger's generated code is still  

technically Java 7 compatible.

<strong>Suggested Fix:</strong> Upgrade to Java 8+ (While Dagger can still test Java 8 at the moment, it is  

also deprecated as of January 2024, and we'll likely need to remove support soon).

Other changes

* Merge pull request <a href="https://github.com/google/dagger/pull/4459" data-hovercard-type="pull_request" data-hovercard-url="/google/dagger/pull/4459/hovercard">#4459</a>: Permit <code>@Multibinds</code> with values  
  that are also allowed by <code>@IntoSet</code>/<code>@IntoMap</code>. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/0f936b5ce8bd350d6c1dbf776b991849ff7a8225/hovercard" href="https://github.com/google/dagger/commit/0f936b5ce8bd350d6c1dbf776b991849ff7a8225"><tt>0f936b5</tt></a>)
* Restrict multibindings from providing framework types that conflict with multibinding types  
  Dagger provides (e.g. <code>@Provides @IntoMap Provider&lt;String&gt;</code>). This is technically a breaking  
  change but existing issues should either be for unused code or code that should have already  
  broken anyway. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/15a30ca15b1ff36ca188a4f4721b8a563f1ef6cb/hovercard" href="https://github.com/google/dagger/commit/15a30ca15b1ff36ca188a4f4721b8a563f1ef6cb"><tt>15a30ca</tt></a>)
* Remove the <code>ignorePrivateAndStaticInjectionForComponent</code> compiler option.  
  This compiler option is only intended for internal testing of the tck tests, and should not be  
  used by clients. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/dfcdc9ccb02987cae76f9027ed9735b8f9d1c3d2/hovercard" href="https://github.com/google/dagger/commit/dfcdc9ccb02987cae76f9027ed9735b8f9d1c3d2"><tt>dfcdc9c</tt></a>)
* Upgrade Hilt Gradle Plugin min AGP version to 8.1 (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/18d2b26ea2adf33a323610be5e828a7adf131a49/hovercard" href="https://github.com/google/dagger/commit/18d2b26ea2adf33a323610be5e828a7adf131a49"><tt>18d2b26</tt></a>)
* Upgrade Kotlin Metadata dependency to 2.0.0-Beta5 (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/9a94d1973fa42b56405c5cf0f80dcebd85e19580/hovercard" href="https://github.com/google/dagger/commit/9a94d1973fa42b56405c5cf0f80dcebd85e19580"><tt>9a94d19</tt></a>)
* Fixes <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2463534109" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4391" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4391/hovercard" href="https://github.com/google/dagger/issues/4391">#4391</a>: Fix gwt issue (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/af62f2ddc33bb43e97ac593f1d0e5fad39c4ad15/hovercard" href="https://github.com/google/dagger/commit/af62f2ddc33bb43e97ac593f1d0e5fad39c4ad15"><tt>af62f2d</tt></a>)
* Add GWT dependencies for Jakarta Inject (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/bea926cbc04ac7e5da00eaf1511889b0f2164dba/hovercard" href="https://github.com/google/dagger/commit/bea926cbc04ac7e5da00eaf1511889b0f2164dba"><tt>bea926c</tt></a>)

