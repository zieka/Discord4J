/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.gateway;

import discord4j.gateway.adapter.WebSocketSession;
import reactor.core.publisher.Mono;

/**
 * Handler for a WebSocket session.
 *
 * @author Rossen Stoyanchev
 */
public interface WebSocketHandler {

	/**
	 * Return the list of sub-protocols supported by this handler. <p>By default an empty array is returned.
	 */
	default String[] getSubProtocols() {
		return new String[0];
	}

	/**
	 * Handle the WebSocket session.
	 *
	 * @param session the session to handle
	 * @return completion {@code Mono<Void>} to indicate the outcome of the WebSocket session handling.
	 */
	Mono<Void> handle(WebSocketSession session);

}
