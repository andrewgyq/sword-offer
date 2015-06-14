/*
面试题4：替换空格
请实现一个函数，把字符串中的每个空格替换成”%20“。例如输入
”we are happy.“, 则输出”we%20are%20happy.“
*/

public class ReplaceBlank{
	public static void main(String[] args) {
		String str = "we are happy.";
		System.out.println(replaceBlank(str));
	}

	private static String replaceBlank(String str){
		char [] ch = str.toCharArray();
		int originalLength = ch.length;
		int numberofBlank = 0;
		for(char c:ch){
			if(c == ' ')
				++numberofBlank;
		}

		int newLength = originalLength + numberofBlank * 2;

		int indexofOriginal = originalLength - 1;
		int indexofNew = newLength - 1;

		char [] result = new char [newLength];
		while(indexofOriginal >= 0){
			if(ch[indexofOriginal] == ' '){
				result[indexofNew--] = '0';
				result[indexofNew--] = '2';
				result[indexofNew--] = '%';
			}
			else{
				result[indexofNew--] = ch[indexofOriginal];
			}
			--indexofOriginal;
		}
		return new String(result);
	}
}