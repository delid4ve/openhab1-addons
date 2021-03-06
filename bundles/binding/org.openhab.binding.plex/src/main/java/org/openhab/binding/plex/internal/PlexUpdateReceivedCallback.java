/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.plex.internal;

import org.openhab.binding.plex.internal.communication.MediaContainer;

/**
 * Callback interface to signal listeners that an update was received from Plex
 * 
 * @author Jeroen Idserda
 * @since 1.7.0
 */
public interface PlexUpdateReceivedCallback {

    /**
     * Update received
     * 
     * @param The update, wrapped in session object
     */
    public void updateReceived(PlexSession session);

    /**
     * Server list was updated
     * 
     * @param MediaContainer object, containing the server list
     */
    public void serverListUpdated(MediaContainer container);
}
