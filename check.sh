#!/bin/bash

# Your REST API endpoint
input_value=${VAL}


# Check if the response contains an error message
if [ "$input_value" = true ]; then
    echo "API call failed. Error message: $response"
    exit 1  # Exit with a non-zero status code to indicate failure
else
    echo "API call successful. Response: $response"
    # Continue with other steps in your script
fi
