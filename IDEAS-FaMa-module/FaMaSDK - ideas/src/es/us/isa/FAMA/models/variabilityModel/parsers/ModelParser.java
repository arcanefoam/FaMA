/*
	This file is part of FaMaTS.

    FaMaTS is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FaMaTS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with FaMaTS.  If not, see <http://www.gnu.org/licenses/>.

 */
package es.us.isa.FAMA.models.variabilityModel.parsers;

import java.util.Collection;

import es.us.isa.FAMA.models.variabilityModel.VariabilityModel;
import es.us.isa.FAMA.stagedConfigManager.Configuration;

public interface ModelParser {

	public void write(VariabilityModel vm, String path);
	
	public void write(VariabilityModel vm, String path, String writerId);
	
	public VariabilityModel read(String path);
	
	public VariabilityModel read(String path, String readerId);
	
	public Configuration readConfiguration(VariabilityModel vm, String path);
	
	public Collection<String> getReadersId();
	
	public Collection<String> getWritersId();
	
}