package com.mjc813.master_refer_interface;

import com.mjc813.master_refer_id.MasterTable;

public interface IRefer {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    Long getMasterTableId();
    void setMasterTableId(Long masterTableId);

    MasterTable getMaster();
    void setMaster(MasterTable masterTableId);

    default void copyMembers(IRefer dto) {
            this.setId(dto.getId());
            this.setName(dto.getName());
            this.setMasterTableId(dto.getMasterTableId());
            this.setMaster(dto.getMaster());
    }
}
