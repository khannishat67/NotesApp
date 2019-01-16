import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Note } from '../note';
import { FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { GlobalDataService } from '../global-data.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit{
  note$:Note
  notes: Note[]
  noteText=new FormControl('');
  constructor(private http:HttpClient,public route: Router,private dataService: GlobalDataService ){}
  ngOnInit(){
    this.getNote();
  }
  addNote(){
    this.note$ = new Note();
    this.note$.text = this.noteText.value;
    this.note$.time = new Date().toLocaleString();
    console.log(this.note$);
   this.dataService.addNote(this.note$).subscribe(result => this.notes.push(result));
    this.getNote();
  }
  getNote(){
    this.dataService.getNotes().subscribe(result=>this.notes = result)
  }
  delete(note:Note){
    this.dataService.deleteNote(note).subscribe();
    this.notes = this.notes.filter(item => item !==note);
  }
 edit(note:Note){
   this.dataService.selectedNote = note
   this.route.navigateByUrl('/home/'+note.id);
 }
}
