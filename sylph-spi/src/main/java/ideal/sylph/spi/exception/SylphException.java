/*
 * Copyright (C) 2018 The Sylph Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ideal.sylph.spi.exception;

public class SylphException
        extends RuntimeException
{
    private final ErrorCode errorCode;

    public SylphException(StandardErrorCode errorCode, String message)
    {
        this(errorCode, message, null);
    }

    public SylphException(StandardErrorCode errorCode, Throwable throwable)
    {
        this(errorCode, null, throwable);
    }

    public SylphException(StandardErrorCode errorCodeSupplier, String message, Throwable cause)
    {
        super(message, cause);
        this.errorCode = errorCodeSupplier.toErrorCode();
    }

    public SylphException(StandardErrorCode errorCodeSupplier, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCodeSupplier.toErrorCode();
    }

    public ErrorCode getErrorCode()
    {
        return errorCode;
    }

    @Override
    public String getMessage()
    {
        String message = super.getMessage();
        if (message == null && getCause() != null) {
            message = getCause().getMessage();
        }
        if (message == null) {
            message = errorCode.getName();
        }
        return message;
    }
}
