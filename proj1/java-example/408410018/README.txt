student number: 408410018, name: 簡新哲

作業操作說明:
1. 開啟.jar檔: java -cp ../../antlr-3.5.2-complete-no-st3.jar org.antlr.Tool
// 路徑為你的antlr-3.5.2-complete-no-st3.jar所在位置
2. 執行makefile，包含以下3種指令
2.1 找到.g檔: java -jar ../../antlr-3.5.2-complete-no-st3.jar mylexer.g
2.2 找到並執行資料夾中的java檔: javac -cp ../../antlr-3.5.2-complete-no-st3.jar:. *.java
2.3 個別進行測試程式: java -cp ../../antlr-3.5.2-complete-no-st3.jar:. testLexer sample1.c
// 測試程式共有sample1.c, sample2.c, sample3.c三個
