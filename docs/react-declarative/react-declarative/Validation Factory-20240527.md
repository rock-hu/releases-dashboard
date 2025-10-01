# Validation Factory

## release on 20240527
## description
## changes
Preset for common validations when pure function way is unnecessary

<strong>Pure function way</strong>

    import { TypedField, FieldType } from "react-declarative";

    export const fields: TypedField[] = [
       {
            type: FieldType.Text,
            title: 'Only number allowed',
            name: 'text',
            isInvalid(obj) {
                if (isNaN(obj.text)) {
                    return 'It is not a number';
                }
                return null;
            },
        },
    ];

<strong>Validation config way</strong>

    import { TypedField, FieldType } from "react-declarative";

    export const fields: TypedField[] = [
       {
            type: FieldType.Text,
            validation: {
                numeric: true,
            },
            title: 'Only number allowed',
            name: 'text',
        },
    ];


