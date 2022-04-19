# Firebase

* Firebase金額予想
  * Firebase無料枠上限<br>
  　 1. Authentication(認証アカウント数)＝1万/月<br>
  　 2. Cloud Firestore(ドキュメントなどのストレージ)<br>
  　  　2-1.保存：1Gib(1GBの107%)<br>
　    　2-2.呼び出し：10GiB/月<br>
 　   　2-3.ドキュメントの書き込み：2万件/日<br>
  　  　2-4.ドキュメントの読み取り：5万件/日<br>
  　  　2-5.ドキュメントの削除：2万件/日<br>
  　 3. Hosting( 静的Webのホスティング。CDNとHTTPSが含まれる。)<br>
  　  　3.1.ストレージ：10GB<br>
  　  　3.2.データ転送量：360MB/日<br>
  　 4. Realtime Database(誰かがデータを更新すると自動で他の端末にも反映される。更にオフライン動作も可能。)<br>
  　    1.同時接続：100<br>
  　    2.GB 保存済み：1GB<br>
  　    3.GB　ダウンロード済み：10GB/月<br>
  　 5. Cloud Storage(写真や動画などのバイナリーデータなどを保存)
  　    1.GB 保存済み：5GB
  　    2.GB ダウンロード済み：1GB/日
  　    3.アップロード：2万/日
  　    4.ダウンロード：5万/日
  * 

## 参考資料
* [Firebase公式](https://firebase.google.com/pricing?hl=ja)
* [FireBase公式ドキュメント](https://firebase.google.com/docs/firestore/quotas?hl=ja)
* [FirebaseのQiita](https://qiita.com/kohashi/items/43ea22f61ade45972881)

* Firebase メアドkeyのデータ取り出し確認
