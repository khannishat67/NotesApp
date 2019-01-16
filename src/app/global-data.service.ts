import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Note } from './note';

@Injectable({
  providedIn: 'root'
})
export class GlobalDataService {
  selectedNote:Note
  constructor(private http:HttpClient) { }

  public getNotes(): Observable<Note[]>{
    return this.http.get<Note[]>("/api/getAll");
  }
   addNote(note$:Note): Observable<Note>{
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':'application/json'
      })
    }
    return  this.http.post<Note>("/api/add",note$,httpOptions);
  }
  deleteNote(note:Note):Observable<Note>{
    return this.http.delete<Note>("/api/delete/"+note.id);
  }
  updateNote(note:Note):Observable<Note>{
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':'application/json'
      })
    }
    return this.http.put<Note>("/api/update",note,httpOptions)

  }
}
