package edu.xjtu.cdl2bpel.common.schema;

import java.util.logging.Logger;

public class SchemaManagerFactory {

	public static SchemaManager createSchemaManager() {
		SchemaManager ret = null;

		try {
			Class cls = Class.forName(DEFAULT_SCHEMA_MANAGER);
			ret = (SchemaManager) cls.newInstance();
		} catch (Exception e) {
			logger.log(java.util.logging.Level.SEVERE,
					"Failed to create schema manager: " + e, e);
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.xml");

	private static final String DEFAULT_SCHEMA_MANAGER = "edu.xjtu.cdl2bpel.common.schema.XSDSchemaManagerImpl";
}
