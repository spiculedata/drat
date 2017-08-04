/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package backend;

import org.apache.oodt.cas.metadata.util.PathUtils;

import java.io.File;

/**
 * Created by stevenfrancus on 10/13/15.
 */
public class FileConstants {
  private static final String DRAT = "drat";
  public static final String DRAT_SUPER_DIR = getDratDirectory();
  public static final String DRAT_WORK_SUPER_DIR = getDratWorkDirectory();
  public static final String OODT_PATH = buildDratSubdirectoryPath("/bin/oodt");
  public static final String WORKFLOW_PATH = buildDratSubdirectoryPath("/workflow/bin/wmgr-client");
  public static final String DRAT_PATH = buildDratSubdirectoryPath("/bin/drat");
  public static final String DRAT_TEMP_UNZIPPED_PATH = buildDratSubdirectoryPath("/data/staging/uploaded_repo");
  public static final String DRAT_TEMP_LOG_OUTPUT = buildDratWorkSubdirectoryPath("/logs/drat_output.log");

  private static String getDratDirectory() {
    final String DRAT_HOME = PathUtils.replaceEnvVariables("[DRAT_HOME]");
    return DRAT_HOME.substring(0, DRAT_HOME.lastIndexOf(DRAT) + DRAT.length());
  }

  private static String getDratWorkDirectory() {
    final String DRAT_HOME = PathUtils.replaceEnvVariables("[DRAT_WORK]");
    return DRAT_HOME.substring(0, DRAT_HOME.lastIndexOf(DRAT) + DRAT.length());
  }



  public static String buildDratSubdirectoryPath(String additionalPath) {
    return DRAT_SUPER_DIR + additionalPath;
  }

  public static String buildDratWorkSubdirectoryPath(String additionalPath){
   return DRAT_WORK_SUPER_DIR + additionalPath;
}
}
