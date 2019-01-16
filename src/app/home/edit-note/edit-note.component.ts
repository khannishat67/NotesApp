import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {Location} from '@angular/common'
import { FormControl } from '@angular/forms';
import { GlobalDataService } from 'src/app/global-data.service';

@Component({
  selector: 'app-edit-note',
  templateUrl: './edit-note.component.html',
  styleUrls: ['./edit-note.component.scss']
})
export class EditNoteComponent implements OnInit {
  noteText=new FormControl('')
  constructor(public route: ActivatedRoute,private location:Location,private dataservice:GlobalDataService) { }

  ngOnInit() {
    this.noteText.setValue(this.dataservice.selectedNote.text)
  }
  update(){
    let note = this.dataservice.selectedNote
    note.text = this.noteText.value
    note.time = new Date().toLocaleString()
    this.dataservice.updateNote(note).subscribe();
    this.location.back();
  }
}
