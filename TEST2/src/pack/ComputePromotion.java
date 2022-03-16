/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

public class ComputePromotion extends Computer {

    public String getPromotion() {
        return this.computePromotion(this.marks);
    }

    private String computePromotion(int marks) {
        String status;
        if (marks < 40) {
            status = "Fail";
        } else {
            status = "Pass";
        }
        return status;
    }

}
