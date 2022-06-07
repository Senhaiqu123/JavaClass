import {RouterModule, Routes} from "@angular/router";
import {PageAComponent} from "./page-a/page-a.component";
import {PageBComponent} from "./page-b/page-b.component";
import {DefaultComponent} from "./default/default.component";
import {ModuleWithProviders} from "@angular/core";

const appRoutes: Routes = [
  { path: 'page-a', component: PageAComponent },
  { path: 'page-b', component: PageBComponent },
  { path: '', redirectTo: '/page-a', pathMatch: 'full' },
  { path: 'page-b/:id/:firstname', component: PageBComponent },
  { path: '**', component: DefaultComponent }
];
export const routing: ModuleWithProviders<any> = RouterModule.forRoot(appRoutes);
