/*
 * // Copyright 2019 The OpenSDS Authors.
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License"); you may
 * // not use this file except in compliance with the License. You may obtain
 * // a copy of the License at
 * //
 * //     http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * // WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * // License for the specific language governing permissions and limitations
 * // under the License.
 *
 */

package org.opensds.vasa.vasa20.device.array.add;

public class SystemUserAuthResBean {
    @Override
    public String toString() {
        return "SystemUserAuthResBean [data=" + data + ", error=" + error + "]";
    }

    private SystemResponseData data;
    private SystemResponseError error;

    public SystemResponseData getData() {
        return data;
    }

    public void setData(SystemResponseData data) {
        this.data = data;
    }

    public SystemResponseError getError() {
        return error;
    }

    public void setError(SystemResponseError error) {
        this.error = error;
    }
}
