/*
 * org.openmicroscopy.omero.model2
 *
 *------------------------------------------------------------------------------
 *
 *  Copyright (C) 2004 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *------------------------------------------------------------------------------
 */
package org.openmicroscopy.omero.model2;

//Java imports
import java.util.Set;

import org.openmicroscopy.omero.model.Category;

//Third-party libraries

//Application-internal dependencies


/** 
 * complement of a *.model.* class to allow for necessary logic/fields.
 * 
 * @author  Josh Moore &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:josh.moore@gmx.de">josh.moore@gmx.de</a>
 * @version 1.0 
 * <small>
 * (<b>Internal version:</b> $Rev$ $Date$)
 * </small>
 * @since 1.0
 */
public class Category2 extends org.openmicroscopy.omero.model.Category {

    /** artificial field to allow for data transport 
     * @DEV.TODO Remove artificial field as soon as possible
     */
    public Set images;
    
    public Set getImages() {
        return images;
    }
    public void setImages(Set images) {
        this.images = images;
    }
    
    public Category2(Category c){
        this.setAttributeId(c.getAttributeId());
     	this.setCategoryGroup(c.getCategoryGroup());
     	this.setClassifications(c.getClassifications());
     	this.setDescription(c.getDescription());
     	this.setModuleExecution(c.getModuleExecution());
     	this.setName(c.getName());
    }
    
}