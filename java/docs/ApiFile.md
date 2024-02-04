

# ApiFile

A file that will be written to the Machine. One of RawValue or SecretName must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**guestPath** | **String** | GuestPath is the path on the machine where the file will be written and must be an absolute path. For example: /full/path/to/file.json |  [optional] |
|**rawValue** | **String** | The base64 encoded string of the file contents. |  [optional] |
|**secretName** | **String** | The name of the secret that contains the base64 encoded file contents. |  [optional] |



