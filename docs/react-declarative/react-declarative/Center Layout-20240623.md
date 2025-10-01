# Center Layout

## release on 20240623
## description
## changes
The <code>FieldType.Center</code> defines the 12 columns grid layout which center the inner if the row is not filled

<a target="_blank" rel="noopener noreferrer" href="https://private-user-images.githubusercontent.com/19227776/342109641-fa9dbb9b-36f7-4bda-8c92-177a6cd8f3a8.gif?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zNDIxMDk2NDEtZmE5ZGJiOWItMzZmNy00YmRhLThjOTItMTc3YTZjZDhmM2E4LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU4NGEwNzBkNjliZTY4NWNhZGVhMjZhMTViMGFmZTA4MGY2NWY0NTZiMzk5NzI1MTY3Y2RmMWM1MDIxNDg4YjkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.LOEX_46DZZyZUIJKPZR_Z9pEELOEaolePTh0ECcDKYY"><img src="https://private-user-images.githubusercontent.com/19227776/342109641-fa9dbb9b-36f7-4bda-8c92-177a6cd8f3a8.gif?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zNDIxMDk2NDEtZmE5ZGJiOWItMzZmNy00YmRhLThjOTItMTc3YTZjZDhmM2E4LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU4NGEwNzBkNjliZTY4NWNhZGVhMjZhMTViMGFmZTA4MGY2NWY0NTZiMzk5NzI1MTY3Y2RmMWM1MDIxNDg4YjkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.LOEX_46DZZyZUIJKPZR_Z9pEELOEaolePTh0ECcDKYY" alt="ezgif-2-352bf5300b" content-type-secured-asset="image/gif" style="max-width: 100%;"></a>

    import { TypedField, FieldType } from "react-declarative";

    declare var BtcCurrency;
    declare var EthCurrency;
    declare var UsdtCurrency;

    export const fields: TypedField[] = [
      {
        type: FieldType.Center,
        sx: (theme) => ({
          [theme.breakpoints.up("lg")]: {
            height: '100vh',
            marginTop: '-56px',
          },
        }),
        child: {
          type: FieldType.Group,
          desktopColumns: '9',
          tabletColumns: '12',
          phoneColumns: '12',
          fields: [
            {
              type: FieldType.Component, 
              fieldRightMargin: '1',
              fieldBottomMargin: '1',
              phoneColumns: '12',
              tabletColumns: '6',
              desktopColumns: '4',
              element: BtcCurrency,
            },
            {
              type: FieldType.Component,
              fieldRightMargin: '1',
              fieldBottomMargin: '1',
              phoneColumns: '12',
              tabletColumns: '6',
              desktopColumns: '4',
              element: EthCurrency,
            },
            {
              type: FieldType.Component,
              fieldRightMargin: '1',
              fieldBottomMargin: '1',
              phoneColumns: '12',
              tabletColumns: '6',
              desktopColumns: '4',
              element: UsdtCurrency,
            },
          ]
        },
      },
    ];


