/*
 * Licensed to Luca Cavanna (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.plugin.river.solr;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.river.RiversModule;
import org.elasticsearch.river.solr.SolrRiverModule;

/**
 * Plugin class for the Solr river
 */
public class SolrRiverPlugin extends AbstractPlugin {

    @Inject
    public SolrRiverPlugin() {
    }

    @Override
    public String name() {
        return "river-solr";
    }

    @Override
    public String description() {
        return "River Solr plugin";
    }

    /**
     * Registers the {@link SolrRiverModule}
     * @param module the elasticsearch module used to handle rivers
     */
    public void onModule(RiversModule module) {
        module.registerRiver("solr", SolrRiverModule.class);
    }
}
