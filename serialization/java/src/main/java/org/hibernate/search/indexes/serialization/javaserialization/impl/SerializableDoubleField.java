/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.indexes.serialization.javaserialization.impl;

import org.hibernate.search.indexes.serialization.spi.LuceneNumericFieldContext;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class SerializableDoubleField extends SerializableNumericField {

	private double value;

	public SerializableDoubleField(double value, LuceneNumericFieldContext context) {
		super( context );
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
