/*******************************************************************************
 * Copyright (c) 2009 Michael Clay and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.model;

import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.texteditor.IAnnotationImageProvider;
import org.eclipse.ui.texteditor.MarkerAnnotation;

/**
 * @author Michael Clay - Initial contribution and API
 * @author Heiko Behrens
 */
public class XtextMarkerAnnotationImageProvider implements IAnnotationImageProvider {

	@Override
	public ImageDescriptor getImageDescriptor(String imageDescritporId) {
		return null;
	}

	@Override
	public String getImageDescriptorId(Annotation annotation) {
		return null;
	}

	@Override
	public Image getManagedImage(Annotation annotation) {
		return null;
	}

}
