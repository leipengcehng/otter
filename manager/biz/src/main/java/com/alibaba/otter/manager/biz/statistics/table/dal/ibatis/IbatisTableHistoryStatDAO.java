/*
 * Copyright (C) 2010-2101 Alibaba Group Holding Limited.
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

package com.alibaba.otter.manager.biz.statistics.table.dal.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alibaba.otter.manager.biz.statistics.table.dal.TableHistoryStatDAO;
import com.alibaba.otter.manager.biz.statistics.table.dal.dataobject.TableHistoryStatDO;
import com.alibaba.otter.manager.biz.statistics.table.param.BehaviorHistoryCondition;

/**
 * @author sarah.lij 2012-7-17 下午06:35:52
 */
public class IbatisTableHistoryStatDAO extends SqlMapClientDaoSupport implements TableHistoryStatDAO {

    @Override
    public void insertTableHistoryStat(TableHistoryStatDO tableHistoryStatDO) {
        getSqlMapClientTemplate().insert("insertTableHistoryStat", tableHistoryStatDO);
    }

    @Override
    public List<TableHistoryStatDO> listTimelineTableStat(BehaviorHistoryCondition condition) {
        return (List<TableHistoryStatDO>) getSqlMapClientTemplate().queryForList("listTimelineTableStat", condition);
    }

}
