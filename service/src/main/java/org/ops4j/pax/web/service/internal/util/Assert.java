/* Copyright 2007 Alin Dreghiciu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service.internal.util;

@SuppressWarnings( { "SameParameterValue" } )
public class Assert
{

    private Assert()
    {
        // utility class
    }

    public static void notNull( final String message, final Object object )
    {
        if( object == null )
        {
            throw new IllegalArgumentException( message );
        }
    }

    public static void notEmpty( final String message, final String object )
    {
        if( object != null && "".equals( object ) )
        {
            throw new IllegalArgumentException( message );
        }
    }
}