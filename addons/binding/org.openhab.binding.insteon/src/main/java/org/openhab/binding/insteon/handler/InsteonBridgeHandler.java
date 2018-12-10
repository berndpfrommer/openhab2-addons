/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.insteon.handler;

import org.eclipse.smarthome.core.thing.Bridge;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseBridgeHandler;
import org.eclipse.smarthome.core.types.Command;
import org.openhab.binding.insteon.internal.config.InsteonBridgeConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link InsteonBridgeHandler} is the handler for Insteon Modems and Hubs. All
 * {@link InsteonHandler}s use the {@link InsteonBridgeHandler} to execute the
 * actual commands.
 *
 * @author Bernd Pfrommer - Initial contribution
 */
public class InsteonBridgeHandler extends BaseBridgeHandler {
    private Logger logger = LoggerFactory.getLogger(InsteonBridgeHandler.class);

    private InsteonBridgeConfiguration configuration = null;

    public InsteonBridgeHandler(Bridge thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        logger.debug("Bridge commands not supported.");
    }

    @Override
    public synchronized void dispose() {
        logger.debug("Handler disposed.");

        super.dispose();
    }

    @Override
    public void initialize() {
        logger.debug("Initializing Insteon bridge handler");
        updateStatus(ThingStatus.OFFLINE);

        configuration = getConfigAs(InsteonBridgeConfiguration.class);
    }

    private synchronized void connect() {
        logger.debug("Connecting to Insteon modem");

        try {
            if (configuration.serialPort != null) {
                // TODO connect to serial port here
            } else if (configuration.host != null) {
                // TODO: connect to hub here
            }
        } catch (Exception e) {
            logger.error("Connection to RFXCOM transceiver failed", e);
        } catch (UnsatisfiedLinkError e) {
            logger.error("Error occurred when trying to load native library for OS '{}' version '{}', processor '{}'",
                    System.getProperty("os.name"), System.getProperty("os.version"), System.getProperty("os.arch"), e);
        }
    }

    public InsteonBridgeConfiguration getConfiguration() {
        return configuration;
    }
}
