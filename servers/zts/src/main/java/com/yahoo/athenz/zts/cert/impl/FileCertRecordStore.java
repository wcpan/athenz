/*
 * Copyright 2017 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.athenz.zts.cert.impl;

import java.io.File;

import com.yahoo.athenz.zts.cert.CertRecordStore;
import com.yahoo.athenz.zts.cert.CertRecordStoreConnection;

public class FileCertRecordStore implements CertRecordStore {

    File rootDir;
    
    public FileCertRecordStore(File rootDirectory) {
        if (!rootDirectory.exists()) {
            if (!rootDirectory.mkdirs()) {
                error("cannot create specified root: " + rootDirectory);
            }
        } else {
            if (!rootDirectory.isDirectory()) {
                error("specified root is not a directory: " + rootDirectory);
            }
        }
        this.rootDir = rootDirectory;
    }

    @Override
    public CertRecordStoreConnection getConnection() {
        return new FileCertRecordStoreConnection(rootDir);
    }
    
    @Override
    public void setOperationTimeout(int opTimeout) {
    }
    
    @Override
    public void clearConnections() {
    }

    static void error(String msg) {
        throw new RuntimeException("FileObjectStore: " + msg);
    }
}
