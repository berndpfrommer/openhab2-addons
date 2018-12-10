/**
 * Copyright (c) 2018,2018 by the respective copyright holders.
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.insteon.internal;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link InsteonBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Bernd Pfrommer - Initial contribution
 */
@NonNullByDefault
public class InsteonBindingConstants {

    private static final String BINDING_ID = "insteon";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");

    public static final ThingTypeUID THING_TYPE_PLMODEM = new ThingTypeUID(BINDING_ID, "PLModem");
    public static final ThingTypeUID THING_TYPE_HUB     = new ThingTypeUID(BINDING_ID, "Hub");

    // List of all Channel ids
    public static final String CHANNEL_1 = "channel1";

    public static final Set<ThingTypeUID> SUPPORTED_BRIDGE_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_PLMODEM, THING_TYPE_HUB);
    public static final Set<ThingTypeUID> SUPPORTED_DEVICE_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_SAMPLE);
}
