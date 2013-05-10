/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.enav.communication;

/**
 * 
 * @author Kasper Nielsen
 */
public abstract class ConnectionListener {

    /** Invoked when the client has fully connected to the server. */
    public void connected() {}

    // not yet implemented
    public final void reconnected() {};

    // not yet implemented
    public final void stateChanged(PersistentConnection.State previousState, PersistentConnection.State newState) {}

    // not yet implemented
    public final void connectionLost(CloseReason closeReason) {}

    /**
     * Invoked when the persistent has been fully closed
     * 
     * @param closeReason
     *            the reason for the close
     */
    public void closed(CloseReason closeReason) {}
}