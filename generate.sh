#!/bin/sh

# docker run --rm mcr.microsoft.com/openapi/kiota \
# generate --language java -n io.fly.sdk.client -c FlySdkClient -o ./sdk/src/main/java/io/fly/sdk/client --openapi https://docs.machines.dev/swagger/doc.json

kiota generate --language java -n io.fly.sdk.client -c FlySdkClient -o ./sdk/src/main/java/io/fly/sdk/client --openapi https://docs.machines.dev/swagger/doc.json