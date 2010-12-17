package org.pentaho.di.core.database;

import org.pentaho.di.core.plugins.DatabaseMetaPlugin;
import org.pentaho.di.core.database.PALODatabaseMeta;

@DatabaseMetaPlugin(type = "PALO", typeDescription = "Palo MOLAP Server")
public class PDI3PALODatabaseMeta extends PALODatabaseMeta implements DatabaseInterface {}

