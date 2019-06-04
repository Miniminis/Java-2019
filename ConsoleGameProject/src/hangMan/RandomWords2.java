package hangMan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


class RandomWords2 {
	
		// 게임단어 랜덤돌리기 - 매 게임마다 정답 단어가 바뀐다
		String randomWord(int n) throws IOException {
			int level = n;
			String rdWord=null;
			ArrayList<String> gameWord1 = new ArrayList<String>();
			
			
			//외부 텍스트 파일로부터 단어를 읽어들이기 위한 bufferedreader instance 생성
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\ConsoleGameProject\\3letterwords.txt"));
			
			while(true) {
				gameWord1.add(in.readLine());
				if(gameWord1==null) {
					break;
				}
			}
			in.close();
			
			switch (level) {
			case 3: // 3글자
				Collections.shuffle(gameWord1);
				rdWord = gameWord1.get(0);
				break;
		/*
		 * case 5: // 5글자 Collections.shuffle(gameWord2); rdWord = gameWord2.get(0);
		 * break; case 10: // 10글자 Collections.shuffle(gameWord3); rdWord =
		 * gameWord3.get(0); break; default: break;
		 */
			}

			return rdWord;
		}

}
