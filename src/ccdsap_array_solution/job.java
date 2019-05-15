package ccdsap_array_solution;

import org.jetbrains.annotations.NotNull;

public class job implements Comparable<job>{
    int sno;
    int dt;
    int pro;

    public job(int sno, int dt, int pro) {
        this.sno = sno;
        this.dt = dt;
        this.pro = pro;
    }


    @Override
    public int compareTo(@NotNull job o) {
        return o.pro-this.pro;
    }

    @Override
    public String toString() {
        return
                "sno=" + sno +
                ", dt=" + dt +
                ", pro=" + pro ;
    }
}
