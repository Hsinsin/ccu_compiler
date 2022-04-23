student number: 408410018, name: 簡新哲

作業操作說明:
1. 在 terminal 上輸入 make init，開啟.jar檔: 
// java -cp ../../antlr-3.5.2-complete-no-st3.jar org.antlr.Tool
// 路徑為你的antlr-3.5.2-complete-no-st3.jar所在位置，若非上兩層資料夾請自行更改

2. 在 terminal 上輸入 make myparser，包含以下 2 種指令:
2.1 找到.g檔: java -jar ../../antlr-3.5.2-complete-no-st3.jar myparser.g
2.2 找到並執行資料夾中的java檔: javac -cp ../../antlr-3.5.2-complete-no-st3.jar:. *.java

3. 個別進行測試程式，在 terminal 上輸入以下指令依次測試: 
3.1 make test1
//java -cp ../../antlr-3.5.2-complete-no-st3.jar:. testParser test1.c

3.2 make test2
//java -cp ../../antlr-3.5.2-complete-no-st3.jar:. testParser test2.c

3.3 make test3
//java -cp ../../antlr-3.5.2-complete-no-st3.jar:. testParser test3.c

4. make clean 可以清除執行過程中產生的所有檔案
// 測試程式共有test1.c, test2.c, test3.c三個
