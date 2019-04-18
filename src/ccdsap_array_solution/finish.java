package ccdsap_array_solution;/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class finish implements Comparable<finish>{
    int start;
    int end;
    int no;

	@Override
	public String toString() {
		return
				"start=" + start +
				", end=" + end +
				", no=" + no
				;
	}

	public finish(int start, int end, int no)
    {
        this.start=start;
        this.end=end;
        this. no=no;
    }
    public int compareTo(finish s)
    {
        return this.end - s.end;
         

    }
    
}

