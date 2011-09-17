/*
 * Copyright (C) 2010-2011 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.network;

import org.geometerplus.zlibrary.core.network.ZLNetworkException;

import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;

public class AllCatalogsSearchItem extends SearchItem {
	public AllCatalogsSearchItem() {
		super(null);
	}

	@Override
	protected String getSummaryString() {
		return 
			getPattern() != null
				? NetworkLibrary.resource().getResource("found").getResource("summary").getValue().replace("%s", getPattern())
				: NetworkLibrary.resource().getResource("search").getResource("summaryAllCatalogs").getValue();
	}

	@Override
	public boolean canBeOpened() {
		return false;
	}

	@Override
	public void loadChildren(NetworkItemsLoader loader) throws ZLNetworkException {
	}
}