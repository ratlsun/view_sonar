/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2008-2012 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.api.security;

import org.sonar.api.BatchComponent;
import org.sonar.api.resources.Resource;

/**
 * Grant access to newly created projects.
 *
 * <p>This component is not supposed to be called by standard plugins.</p>
 *
 * @since 3.2
 */
public interface ResourcePermissioning extends BatchComponent {

  boolean hasRoles(Resource resource);

  void grantDefaultRoles(Resource resource);

  void grantUserRole(Resource resource, String login, String role);

  void grantGroupRole(Resource resource, String groupName, String role);
}