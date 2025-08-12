package com.examplecoop.springexam.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class searchDTO {
    private Integer cntPage;
    private Integer offPage;
    private Integer curPage;

    public Integer getOffPage() {
        return (this.getCurPage() - 1) * this.getCntPage();
    }
}
