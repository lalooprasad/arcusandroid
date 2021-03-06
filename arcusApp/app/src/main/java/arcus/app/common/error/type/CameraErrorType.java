/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.app.common.error.type;

import arcus.app.common.error.ErrorLocator;
import arcus.app.common.error.base.Error;

public enum  CameraErrorType implements ErrorType {
    NO_CAMERA_AVAILABLE(ErrorLocator.genericFatalError);

    private Error error;
    CameraErrorType(Error error) {
        this.error = error;
    }

    @Override
    public arcus.app.common.error.base.Error getError() {
        return error;
    }
}
