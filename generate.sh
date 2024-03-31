#!/bin/sh

docker run --rm mcr.microsoft.com/openapi/kiota \
generate --language java -n io.fly.sdk -c FlySdkClient --openapi \
https://docs.machines.dev/swagger/doc.json