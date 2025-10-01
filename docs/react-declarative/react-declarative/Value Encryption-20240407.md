# Value Encryption

## release on 20240407
## description
## changes
Value read and write transformation support for <code>&lt;One /&gt;</code> component

    <One
      ...
      readTransform={(value, name) => {
        if (name.startsWith("api_token_")) {
          return ioc.cryptService.decrypt(value as string);
        }
        return value;
      }}
      writeTransform={(value, name) => {
        if (name.startsWith("api_token_")) {
          return ioc.cryptService.crypt(value as string);
        }
        return value;
      }}
      ...


