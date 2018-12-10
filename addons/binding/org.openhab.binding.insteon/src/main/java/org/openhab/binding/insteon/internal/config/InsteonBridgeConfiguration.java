/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.insteon.internal.config;

/**
 * Configuration class for {@link InsteonBridge} device.
 *
 * @author Bernd Pfrommer - Initial contribution
 */
public class InsteonBridgeConfiguration {
    public static final String SERIAL_PORT = "serialPort";
    public static final String INSTEON_ADDRESS = "insteonAddress";

    // Serial port for manual configuration
    public String serialPort;

    // Host for devices that use TCP/IP
    public String host;

    // port for TCP/IP
    public int port;

    public String modemType;

}
