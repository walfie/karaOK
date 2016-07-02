package com.github.walfie.karaok.domain

/* Sample JSON response:
   ```
   {
     "searchResult": [
     {
       "artistId": "91801",
       "artistName": "わか、ふうり、すなお from STAR☆ANIS",
       "distEnd": "99999999",
       "distStart": "20130330",
       "firstBars": "",
       "funcAnimePicture": "",
       "funcPersonPicture": "",
       "funcRecording": "",
       "funcScore": "",
       "indicationMonth": "",
       "myKey": "0",
       "orgKey": "0",
       "programTitle": "",
       "reqNo": "360715",
       "songName": "アイドル活動!",
       "titleFirstKana": ""
     }
     ],
     "totalCount": "2",
     "totalPage": "1"
   }
   ```
*/

case class SearchResult[T](
  searchResult: Seq[T],
  totalCount:   String,
  totalPage:    String
)

case class Song(
  artistId:          String,
  artistName:        String,
  distEnd:           String,
  distStart:         String,
  firstBars:         String,
  funcAnimePicture:  String,
  funcPersonPicture: String,
  funcRecording:     String,
  funcScore:         String,
  indicationMonth:   String,
  myKey:             String,
  orgKey:            String,
  programTitle:      String,
  reqNo:             String,
  songName:          String,
  titleFirstKana:    String
)
