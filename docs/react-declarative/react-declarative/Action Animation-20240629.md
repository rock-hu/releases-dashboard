# Action Animation

## release on 20240629
## description
## changes
The <code>&lt;ActionBounce /&gt;</code> component will allow you to animate paper with <code>ActionState.Active</code>, <code>ActionState.Succeed</code> and <code>ActionState.Abort</code> animations

<a target="_blank" rel="noopener noreferrer" href="https://private-user-images.githubusercontent.com/19227776/344422086-6d66d00b-b0db-49b1-b16d-4ce1210a2674.gif?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zNDQ0MjIwODYtNmQ2NmQwMGItYjBkYi00OWIxLWIxNmQtNGNlMTIxMGEyNjc0LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTFjYTdkYTE1MzQ2M2M3ZGFiZDQyY2Q4ZGFjYTIxYmNmZDIyM2IzYjQ0Y2QwODI2MzE0ZDA0NWI2OTg0MDgwOTAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.Kw_8iUcKH0dQlmTU4at_XSVPnQqkCs78NRm2fPx2CQ8"><img src="https://private-user-images.githubusercontent.com/19227776/344422086-6d66d00b-b0db-49b1-b16d-4ce1210a2674.gif?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTkyODA2ODMsIm5iZiI6MTc1OTI4MDM4MywicGF0aCI6Ii8xOTIyNzc3Ni8zNDQ0MjIwODYtNmQ2NmQwMGItYjBkYi00OWIxLWIxNmQtNGNlMTIxMGEyNjc0LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDAxVDAwNTk0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTFjYTdkYTE1MzQ2M2M3ZGFiZDQyY2Q4ZGFjYTIxYmNmZDIyM2IzYjQ0Y2QwODI2MzE0ZDA0NWI2OTg0MDgwOTAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.Kw_8iUcKH0dQlmTU4at_XSVPnQqkCs78NRm2fPx2CQ8" alt="ezgif-6-bdf0030c17" content-type-secured-asset="image/gif" style="max-width: 100%;"></a>

    import { TypedField, FieldType, ActionBounce, ActionState, Subject } from "react-declarative";

    const sleep = (delay = 1_000) => new Promise<void>((res) => setTimeout(() => res(), delay))

    const stateSubject = new Subject<ActionState>();

    export const fields: TypedField[] = [
      {
        type: FieldType.Box,
        sx: {
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          height: '80vh',
        },
        child: {
          type: FieldType.Layout,
          customLayout: ({ children }) => (
            <ActionBounce transparentPaper stateSubject={stateSubject}>
              {children}
            </ActionBounce>
          ),
          child: {
            type: FieldType.Paper,
            sx: {
              width: "256px",
            },
            fields: [
              {
                type: FieldType.Typography,
                typoVariant: 'h4',
                placeholder: 'Sign in',
              },
              {
                type: FieldType.Text,
                fieldRightMargin: '0',
                fieldBottomMargin: '2',
                outlined: true,
                name: 'login',
              },
              {
                type: FieldType.Text,
                fieldRightMargin: '0',
                fieldBottomMargin: '1',
                outlined: true,
                inputType: 'password',
                name: 'password',
              },
              {
                type: FieldType.Box,
                sx: {
                  minHeight: '28px',
                },
              },
              {
                type: FieldType.Icon,
                fieldRightMargin: '0',
                fieldBottomMargin: '0',
                iconBackground: 'warning',
                sx: {
                  marginBottom: '-32px',
                },
                iconSize: 48,
                click: async (name, e, data) => {
                  stateSubject.next(ActionState.Active);
                  await sleep();
                  stateSubject.next(ActionState.Succeed);
                  await sleep();
                  stateSubject.next(ActionState.Abort);
                },
              },
            ]
          },
        },
      },
    ];


