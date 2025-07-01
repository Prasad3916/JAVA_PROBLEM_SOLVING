package com.example.arrays;
public class Test {
	boolean flag = false;
	int [] a = {4,5,1,2,3};
	int [] res = {1,2,3,4,5};
	public boolean findRotation() {
		int t = 0;
		if(a.length == res.length) {
			for(int i = 0;i < a.length;i++) {
				for(int j = 0;j < a.length;j++) {
					if(res[i] == a[j] ) {
						t = j;
						if((i+1) != a.length && (j+1) != a.length ) {
							if(res[i+1] == a[j+1]) {
								flag = true;
							}
							else {
								return false;
							}
						}
						else if((j) == a.length && (i) != a.length) {
							for(int k = 0;k < t;k++) {
								if(res[i++] == a[k]) {
									flag = true;
								}
								else {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return flag;
		
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.findRotation());
	}

}
