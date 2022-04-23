#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct treenode{
    char *word;
    struct treenode *left;
    struct treenode *right;
}Treenode;

typedef struct treearray{
    char *word;
    int cnt;
}ARRAY;

int listcnt=0;
ARRAY list[1024];

Treenode *tree_new(char *input,Treenode *left,Treenode *right){
    Treenode *newnode=malloc(sizeof(Treenode));
    newnode->word=strdup(input);
    newnode->left=left;
    newnode->right=right;
    return newnode;
}

void inorder(Treenode *root){
    if(root==NULL) return;
    inorder(root->left);
    printf("%s\n",root->word);
    inorder(root->right);
}

void preorder(Treenode *root){
    if(root==NULL) return;
    printf("%s\n",root->word);
    preorder(root->left);
    preorder(root->right);
}

void postorder(Treenode *root){
    if(root==NULL) return;
    postorder(root->left);
    postorder(root->right);
    printf("%s\n",root->word);
}

Treenode *tree_insert(Treenode *root,char *input){
    if(root==NULL) {
        return tree_new(input,NULL,NULL);
    }
    if(strcmp(input,root->word)<0){
        root->left=tree_insert(root->left,input);
    }
    if(strcmp(input,root->word)>0){
        root->right=tree_insert(root->right,input);
    }
    return root;
}

void tree_free(Treenode *root){
    if(root==NULL) return;
    else{
        tree_free(root->left);
        tree_free(root->right);
        free(root);
    }
}

int main(int argc,char **argv)
{
    Treenode *root=NULL;
    char input[1024];
    while(fgets(input,1024,stdin)){
        input[strcspn(input,"\n")]='\0';
        char *ptr=input;
        root=tree_insert(root,ptr);
    }
    if(strcmp(*(argv+1),"-i")==0) inorder(root);
    if(strcmp(*(argv+1),"-P")==0) postorder(root);
    if(strcmp(*(argv+1),"-p")==0) preorder(root);
    tree_free(root);
    return 0;
}
