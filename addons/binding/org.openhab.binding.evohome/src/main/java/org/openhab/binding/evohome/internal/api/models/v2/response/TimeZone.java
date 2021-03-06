/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.evohome.internal.api.models.v2.response;

import com.google.gson.annotations.SerializedName;

/**
 * Response model for the time zone
 *
 * @author Jasper van Zuijlen - Initial contribution
 *
 */
public class TimeZone {

    @SerializedName("timeZoneId")
    private String timeZoneId;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("offsetMinutes")
    private int offsetMinutes;

    @SerializedName("currentOffsetMinutes")
    private int currentOffsetMinutes;

    @SerializedName("supportsDaylightSaving")
    private boolean supportsDaylightSaving;

}
