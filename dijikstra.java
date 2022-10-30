import java.util.Scanner;
public class dijikstra
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n= in.nextInt();
        int adj[][]=new int[n][n];
        System.out.println("Enter the adjacency matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                adj[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the source vertix");
        int src= in.nextInt();
        int[] dist= dijkstra(adj, src);
        for(int i=1;i<n;i++)
        {
            if((src-1)==i)
            {
                continue;
            }
            System.out.println("Shoretest distance from "+ src+ " to "+ (i+1)+ " is "+dist[i]);
        }

    }

    static int[] dijkstra(int adj[][], int src)
    {
        int n=adj.length;
        int[] dist = new int[n];
        Boolean[] visited = new Boolean[n];
        int mini, unvis=-1;
        for(int i=0;i<n;i++)
        {
            dist[i]=adj[src-1][i];
            visited[i]=false;
        }
        visited[src-1]=true;
        for(int i=1;i<n;i++)
        {
             mini =Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(!visited[j] && dist[j]<mini)
                {
                    unvis=j;
                    mini=dist[j];
                }
            }
            visited[unvis]=true;
            for(int v=0;v<n;v++)
            {
                if(!visited[v] && dist[unvis]+adj[unvis][v]<dist[v])
                {
                    dist[v]=dist[unvis]+adj[unvis][v];
                }
            }
        }
        return dist;
    }
}


