package com.mjc813.master_refer_interface;

import com.mjc813.master_refer_id.MasterTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReferDto implements IRefer {
    private Long id;
    private String name;
    private Long masterTableId;
    private MasterTable master;

    @Override
    public void setMasterTableId(Long masterTableId) {
        this.masterTableId = masterTableId;
        if(master == null) {
            master = new MasterTable();
        }
        this.master.setId(masterTableId);
    }

    @Override
    public Long getMasterTableId() {
        return masterTableId = this.master.getId();
    }



}
