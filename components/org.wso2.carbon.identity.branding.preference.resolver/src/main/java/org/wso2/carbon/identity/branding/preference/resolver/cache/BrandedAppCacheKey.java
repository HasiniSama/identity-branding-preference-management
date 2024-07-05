/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.branding.preference.resolver.cache;

import org.wso2.carbon.identity.core.cache.CacheKey;

/**
 * Cache key for lookup branding resolved app from the cache.
 */
public class BrandedAppCacheKey extends CacheKey {

    private static final long serialVersionUID = -3241022571833301888L;

    private String brandedAppIdentifier;

    /**
     * @param brandedAppIdentifier Identifier of the app that the branding is applied to.
     */
    public BrandedAppCacheKey(String brandedAppIdentifier) {

        this.brandedAppIdentifier = brandedAppIdentifier;
    }

    /**
     * @return Identifier of the app that the branding is applied to.
     */
    public String getBrandedAppIdentifier() {

        return brandedAppIdentifier;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        BrandedAppCacheKey that = (BrandedAppCacheKey) o;

        return brandedAppIdentifier.equals(that.brandedAppIdentifier);
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = 31 * result + brandedAppIdentifier.hashCode();
        return result;
    }
}
