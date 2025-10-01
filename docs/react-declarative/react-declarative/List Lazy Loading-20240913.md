# List Lazy Loading

## release on 20240913
## description
## changes
<code>&lt;List /&gt;</code> component now lazy load only those rows which placed in the current viewport when <code>withRestorePos</code> flag enabled. Made by using <a href="https://developer.mozilla.org/en-US/docs/Web/API/Intersection_Observer_API" rel="nofollow">IntersectionObserver API</a>

    const connect = useListIntersectionConnect(data.id);

    ...

    <TableRow ref={connect} ...

The custom cell template could be also engaged for lazy loading

    {
      type: ColumnType.Compute,
      field: "some_field",
      element: (data) => {
        const isVisible = useListIntersectionListen(data.id);
        return (
          <Async payload={data} disabled={!isVisible}>
            {async () => {
              ...
            }}
          </Async>
        )
      }
    }


