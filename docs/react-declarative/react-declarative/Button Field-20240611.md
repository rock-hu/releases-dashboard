# Button Field

## release on 20240611
## description
## changes
The <code>FieldType.Button</code> will help you creating forms without unnecessary JSX injections

    import { TypedField, FieldType } from "react-declarative";

    export const fields: TypedField[] = [
      {
        type: FieldType.Text,
        name: 'test',
      },
      {
        type: FieldType.Button,
        buttonVariant: 'contained',
        click: (name, e, data) => {
          alert(JSON.stringify(data, null, 2))
        },
        title: 'test'
      },
    ];

<a target="_blank" rel="noopener noreferrer" href="https://private-user-images.githubusercontent.com/19227776/338653387-980e382e-9e5f-4465-83a9-96ac474aec20.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zMzg2NTMzODctOTgwZTM4MmUtOWU1Zi00NDY1LTgzYTktOTZhYzQ3NGFlYzIwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU2YzRlZDY5MmU3NGI0NGE5NjdjN2FlZDBkYzVhNzBmYTcxYjBkNTFiOTQ1MjQ1MzdmNzg5ZGU5OTdjODQxMmYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.ma68hucNXHWndHJ-hjTmoDuCoiGA7eVMupHS0YOwrkE"><img src="https://private-user-images.githubusercontent.com/19227776/338653387-980e382e-9e5f-4465-83a9-96ac474aec20.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zMzg2NTMzODctOTgwZTM4MmUtOWU1Zi00NDY1LTgzYTktOTZhYzQ3NGFlYzIwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWU2YzRlZDY5MmU3NGI0NGE5NjdjN2FlZDBkYzVhNzBmYTcxYjBkNTFiOTQ1MjQ1MzdmNzg5ZGU5OTdjODQxMmYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.ma68hucNXHWndHJ-hjTmoDuCoiGA7eVMupHS0YOwrkE" alt="image" content-type-secured-asset="image/png" style="max-width: 100%;"></a>

