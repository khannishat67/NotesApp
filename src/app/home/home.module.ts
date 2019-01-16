import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

import { HomePage } from './home.page';
import { EditNoteComponent } from './edit-note/edit-note.component';

const routes: Routes = [
  
  
];
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    IonicModule,
    RouterModule.forChild([
      {
        path: '',
        component: HomePage
      },
      {
        path: ':id',
        component: EditNoteComponent
      }
  
    ]),
    
  ],
  declarations: [HomePage, EditNoteComponent]
})
export class HomePageModule {}
