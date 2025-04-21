# Logback 1.5.18

## release on 20250318
## description
## changes
<strong>2025-03-18 Release of logback version 1.5.18</strong>

• Added<a href="https://logback.qos.ch/manual/appenders.html#fileCompression" rel="nofollow"> support for XZ compression</a> for archived log files. Note that XZ compression requires Tukaani project's <a href="https://tukaani.org/xz/java.html" rel="nofollow">XZ library</a> for Java. In case XZ compression is requested but the XZ library is missing, then logback will substitute GZ compression as a fallback. This feature was requested in issues/755.

• Removed references to <code>java.security.AccessController</code> class. This class has been deprecated for some time and is slated for removal in future JDK versions.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/b2a02f065379a9b1ba5ff837fc08913b744774bc/hovercard" href="https://github.com/qos-ch/logback/commit/b2a02f065379a9b1ba5ff837fc08913b744774bc"><tt>b2a02f0</tt></a> associated with the tag v_1.5.18. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

